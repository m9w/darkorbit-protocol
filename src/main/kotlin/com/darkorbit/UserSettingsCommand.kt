package com.darkorbit

interface UserSettingsCommand : ProtocolPacket {
	var audioSettingsModule: AudioSettingsModule
	var displaySettingsModule: DisplaySettingsModule
	var gameplaySettingsModule: GameplaySettingsModule
	var qualitySettingsModule: QualitySettingsModule
	var questSettingsModule: QuestSettingsModule
	var windowSettingsModule: WindowSettingsModule
}
