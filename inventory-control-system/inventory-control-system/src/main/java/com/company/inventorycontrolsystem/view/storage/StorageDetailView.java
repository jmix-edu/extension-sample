package com.company.inventorycontrolsystem.view.storage;

import com.company.inventorycontrolsystem.entity.Storage;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "storages/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_Storage.detail")
@ViewDescriptor(path = "storage-detail-view.xml")
@EditedEntityContainer("storageDc")
public class StorageDetailView extends StandardDetailView<Storage> {
}