package com.company.inventorycontrolsystem.view.shipper;

import com.company.inventorycontrolsystem.entity.Shipper;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "shippers", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_Shipper.list")
@ViewDescriptor(path = "shipper-list-view.xml")
@LookupComponent("shippersDataGrid")
@DialogMode(width = "64em")
public class ShipperListView extends StandardListView<Shipper> {
}