package com.github.dmvoit.extension

import org.eclipse.swt.SWT
import org.eclipse.swt.layout.FillLayout

fun FillLayout.horizontal(): FillLayout {
    type = SWT.HORIZONTAL
    return this
}

fun FillLayout.vertical(): FillLayout {
    type = SWT.VERTICAL
    return this
}

fun FillLayout.setMargin(width: Int = 0, height: Int = 0): FillLayout {
    marginWidth = width
    marginHeight = height
    return this
}

fun FillLayout.setSpacing( spacing: Int = 0): FillLayout {
    this.spacing = spacing
    return this
}


