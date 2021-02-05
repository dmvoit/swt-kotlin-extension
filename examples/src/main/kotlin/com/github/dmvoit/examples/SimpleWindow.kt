package com.github.dmvoit.examples

import com.github.dmvoit.extension.*
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Shell


fun main() {
    val shell = Shell().apply {
        setSize(100,100)
        setCenter()
        fillLayout().vertical().setSpacing(5)
    }

    shell.label("Text")

    shell.button("press me")
        .addListener(SWT.Selection) {
            println("pressed")
        }

    with(shell) {
        open()
        readAndDispatch()
    }
}