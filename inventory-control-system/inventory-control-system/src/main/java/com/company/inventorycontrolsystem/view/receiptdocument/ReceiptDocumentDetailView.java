package com.company.inventorycontrolsystem.view.receiptdocument;

import com.company.inventorycontrolsystem.entity.ReceiptDocument;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "receiptDocuments/:id", layout = DefaultMainViewParent.class)
@ViewController(id = "ics_ReceiptDocument.detail")
@ViewDescriptor(path = "receipt-document-detail-view.xml")
@EditedEntityContainer("receiptDocumentDc")
public class ReceiptDocumentDetailView extends StandardDetailView<ReceiptDocument> {
}