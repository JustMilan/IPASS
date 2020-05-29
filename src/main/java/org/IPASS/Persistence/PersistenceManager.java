package org.IPASS.Persistence;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import org.IPASS.Afspraak.Afspraak;

import java.io.*;

public class PersistenceManager {
    private final static String ENDPOINT = "https://milandolbephu.blob.core.windows.net/";
    private final static String SASTOKEN = "?sv=2019-10-10&ss=b&srt=co&sp=rwdlacx&se=2020-12-16T05:34:23Z&st=2020-05-28T20:34:23Z&spr=https&sig=OUX3iVDA60esLA%2F%2F50D3h263F%2B0VtWe4%2F1m931yODbQ%3D";
    private final static String CONTAINER = "IPASSContainer";
    private final static String BLOB_NAME = "kappers_afspraken";

    private static BlobContainerClient blobContainer = new BlobContainerClientBuilder()
            .endpoint(ENDPOINT)
            .sasToken(SASTOKEN)
            .containerName(CONTAINER)
            .buildClient();

    public static void saveAfspraakToAzure() throws IOException {
        if (!blobContainer.exists()) {
            blobContainer.create();
        }

        BlobClient blob = blobContainer.getBlobClient("afspraak_blob");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
//        oos.writeObject(Afspraak.getAfspraak());

        byte[] bytez = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytez);
        blob.upload(bais, bytez.length, true);


        oos.close();
        bais.close();
    }

    public static void loadAfspraakFromAzure() throws IOException, ClassNotFoundException {
        if (blobContainer.exists()) {

            BlobClient blob = blobContainer.getBlobClient("afspraak_blob");

            if (blob.exists()) {

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                blob.download(baos);

                byte[] bytez = baos.toByteArray();

                ByteArrayInputStream bais = new ByteArrayInputStream(bytez);
                ObjectInputStream ois = new ObjectInputStream(bais);

                Object obj = ois.readObject();

                if (obj instanceof Afspraak) {
                    Afspraak loadedAfspraak = (Afspraak) obj;
//                    Afspraak.setAfspraak(loadedAfspraak);
                }
                baos.close();
                ois.close();
            }
        }
    }
}
