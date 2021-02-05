package com.github.dmvoit.extension

import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.*


fun Composite.button(name: String = "", opt: Int = SWT.PUSH): Button {
    val button = Button(this, opt)
    button.text = name
    return button
}

fun Composite.text(name: String = "", opt: Int = SWT.SINGLE): Text {
    val txt = Text(this, opt)
    txt.text = name
    return txt
}

fun Composite.label(name: String = "", opt: Int = SWT.NONE): Label {
    val label = Label(this, opt)
    label.text = name
    return label
}

