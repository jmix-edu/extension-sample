package com.company.application.view.storagedetail;

import com.company.inventorycontrolsystem.view.storage.StorageDetailView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DefaultMainViewParent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "storages/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_Storage.detail")
@ViewDescriptor(path = "ext-storage-detail-view.xml")
public class ExtStorageDetailView extends StorageDetailView {
}