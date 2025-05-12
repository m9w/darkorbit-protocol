package com.darkorbit

interface UIWindowActionModule : ProtocolPacket {
	var maxFlashes: Int
	var showArrow: Boolean
	var windowAction: WindowAction
	var windowID: WindowIDModule
}
