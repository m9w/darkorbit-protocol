package com.darkorbit

interface UIButtonActionModule : ProtocolPacket {
	var buttonAction: ButtonAction
	var buttonID: ButtonIDModule
	var maxFlashes: Int
	var showArrow: Boolean
}
