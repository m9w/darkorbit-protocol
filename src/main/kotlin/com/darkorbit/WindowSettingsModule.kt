package com.darkorbit

interface WindowSettingsModule : ProtocolPacket {
	var barStatus: String
	var hideAllWindows: Boolean
	var minmapScale: Int
}
