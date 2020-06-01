function removeAllOptions(sel, removeGrp) {
    let i;
    let len, groups, par;
    if (removeGrp) {
        groups = sel.getElementsByTagName('optgroup');
        len = groups.length;
        for (i = len; i; i--) {
            sel.removeChild(groups[i - 1]);
        }
    }

    len = sel.options.length;
    for (i = len; i; i--) {
        par = sel.options[i - 1].parentNode;
        par.removeChild(sel.options[i - 1]);
    }
}

function appendDataToSelect(sel, obj) {
    const f = document.createDocumentFragment();
    let labels = [], group, opts;

    function addOptions(obj) {
        const f = document.createDocumentFragment();
        let o;

        let i = 0, len = obj.text.length;
        for (; i < len; i++) {
            o = document.createElement('option');
            o.appendChild(document.createTextNode(obj.text[i]));

            if (obj.value) {
                o.value = obj.value[i];
            }

            f.appendChild(o);
        }
        return f;
    }

    if (obj.text) {
        opts = addOptions(obj);
        f.appendChild(opts);
    } else {
        for (const prop in obj) {
            if (obj.hasOwnProperty(prop)) {
                labels.push(prop);
            }
        }

        let i = 0, len = labels.length;
        for (; i < len; i++) {
            group = document.createElement('optgroup');
            group.label = labels[i];
            f.appendChild(group);
            opts = addOptions(obj[labels[i]]);
            group.appendChild(opts);
        }
    }
    sel.appendChild(f);
}

const Select_List_Data = {
    'choices[]': {
        js: {
            'Free Scripts': {
                text: ['Slider Control', 'Scrollers', 'Banner Rotator'],
                value: ['slider', 'scrollers', 'banner']
            },
            'License': {
                text: ['Scrolling Divs', 'Tooltips', 'Rotate Images'],
                value: ['scroll', 'tooltips', 'rotate']
            }
        },
        php: {
            text: ['Random Image', 'Rotate Images', 'Form Class', 'Table Class', 'Order Form'],
            value: ['random', 'rotate', 'form', 'table', 'order']
        },
        tuts: {
            'Download Demos': {
                text: ['Iframes', 'PHP to JS', 'Unobtrusive JS']
            }, 'No Download': {
                text: ['Object Literals', 'Initializing JS', 'JS Errors']
            }
        }
    }
};
document.forms['demoForm'].elements['category'].onchange = function (e) {
    var relName = 'choices[]';
    var relList = this.form.elements[relName];
    var obj = Select_List_Data[relName][this.value];
    removeAllOptions(relList, true);
    appendDataToSelect(relList, obj);
};

window.onload = function () {
    const form = document.forms['demoForm'];
    const sel = form.elements['category'];
    sel.selectedIndex = 0;
    const relName = 'choices[]';
    const rel = form.elements[relName];
    const data = Select_List_Data[relName][sel.value];
    appendDataToSelect(rel, data);
};
