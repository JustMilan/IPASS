package org.IPASS.Persistence;

import com.azure.storage.blob.specialized.BlobAsyncClientBase;
import com.azure.storage.blob.specialized.BlobClientBase;
import com.azure.storage.blob.specialized.SpecializedBlobClientBuilder;

import java.io.InputStream;
import java.io.OutputStream;

public class BlobClient extends BlobClientBase {

    /**
     * Constructor used by {@link SpecializedBlobClientBuilder}.
     *
     * @param client the async blob client
     */
    protected BlobClient(BlobAsyncClientBase client) {
        super(client);
    }

    public void delete() {

}
public void download(OutputStream stream) {

}

public void upload(InputStream data, long length) {

}

public void upload(InputStream data, long length, boolean overwrite) {

}
}
