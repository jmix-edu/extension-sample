package com.company.inventorycontrolsystem.view.receiptdocument;

import com.company.inventorycontrolsystem.entity.ReceiptDocument;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "receiptDocuments", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_ReceiptDocument.list")
@ViewDescriptor(path = "receipt-document-list-view.xml")
@LookupComponent("receiptDocumentsDataGrid")
@DialogMode(width = "64em")
public class ReceiptDocumentListView extends StandardListView<ReceiptDocument> {
}