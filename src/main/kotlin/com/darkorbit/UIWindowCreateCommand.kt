package com.darkorbit

interface UIWindowCreateCommand : ProtocolPacket {
	var alignement: AlignmentModule
	var showButtons: Boolean
	var textKeys: MutableList<String>
	var videoId: Int
	var windowId: Int
}
