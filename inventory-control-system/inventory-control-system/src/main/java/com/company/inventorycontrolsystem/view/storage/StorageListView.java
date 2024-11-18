package com.company.inventorycontrolsystem.view.storage;

import com.company.inventorycontrolsystem.entity.Storage;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "storages", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_Storage.list")
@ViewDescriptor(path = "storage-list-view.xml")
@LookupComponent("storagesDataGrid")
@DialogMode(width = "64em")
public class StorageListView extends StandardListView<Storage> {
}