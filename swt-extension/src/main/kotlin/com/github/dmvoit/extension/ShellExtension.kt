package com.github.dmvoit.extension

import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell


fun Shell.readAndDispatch() {
    val display = Display.getDefault()
    while (!this.isDisposed) {
        if (!display.readAndDispatch()) {
            display.sleep()
        }
    }
}

fun Shell.setCenter() {
    val display = this.display

    val primary = display.primaryMonitor
    val bounds = primary.bounds
    val rect = this.bounds

    val x = bounds.x + (bounds.width - rect.width) / 2
    val y = bounds.y + (bounds.height - rect.height) / 2

    this.setLocation(x, y)
}
