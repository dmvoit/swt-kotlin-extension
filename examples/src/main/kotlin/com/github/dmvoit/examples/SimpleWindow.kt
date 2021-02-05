package com.github.dmvoit.examples

import com.github.dmvoit.extension.button
import com.github.dmvoit.extension.readAndDispatch
import com.github.dmvoit.extension.setCenter
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.widgets.Shell


fun main() {
    val shell = Shell().apply {
        setSize(100,100)
        setCenter()
        layout = FillLayout()
    }

    shell.button("press me")
        .addListener(SWT.Selection) {
            println("pressed")
        }

    with(shell) {
        open()
        readAndDispatch()
    }
}