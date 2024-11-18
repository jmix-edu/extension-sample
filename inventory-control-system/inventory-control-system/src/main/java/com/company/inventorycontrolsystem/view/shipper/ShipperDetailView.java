package com.company.inventorycontrolsystem.view.shipper;

import com.company.inventorycontrolsystem.entity.Shipper;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "shippers/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_Shipper.detail")
@ViewDescriptor(path = "shipper-detail-view.xml")
@EditedEntityContainer("shipperDc")
public class ShipperDetailView extends StandardDetailView<Shipper> {
}