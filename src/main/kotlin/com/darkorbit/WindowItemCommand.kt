package com.darkorbit

interface WindowItemCommand : ItemCommand {
	var height: Int
	var helpText: MessageKeyListWildcardCommand
	var maximized: Boolean
	var posX: Int
	var posY: Int
	var width: Int
	var windowTitle: String
}
