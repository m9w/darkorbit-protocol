package com.darkorbit

interface UIWindowSettingsCommand : ProtocolPacket {
	var windowSettings: MutableList<UIWindowSettingModule>
}
