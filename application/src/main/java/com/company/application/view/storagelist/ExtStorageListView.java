package com.company.application.view.storagelist;

import com.company.inventorycontrolsystem.view.storage.StorageListView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DefaultMainViewParent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "storages", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_Storage.list")
@ViewDescriptor(path = "ext-storage-list-view.xml")
public class ExtStorageListView extends StorageListView {
}