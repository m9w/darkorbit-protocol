package com.darkorbit

interface SettingSetRequest : ProtocolPacket {
	var immediately: Boolean
	var key: String
	var value: String
}
