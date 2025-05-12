package com.darkorbit

interface UIWindowSettingModule : ProtocolPacket {
	var maximized: Boolean
	var windowID: WindowIDModule
	var x: Int
	var y: Int
}
