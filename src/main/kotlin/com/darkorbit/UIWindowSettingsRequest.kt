package com.darkorbit

interface UIWindowSettingsRequest : ProtocolPacket {
	var windowSettings: MutableList<UIWindowSettingModule>
}
