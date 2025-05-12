package com.darkorbit

interface WindowSettingsRequest : ProtocolPacket {
	var barStatus: String
	var gameFeatureMenuOrder: String
	var gameFeatureMenuPosition: String
	var genericFeatureMenuOrder: String
	var genericFeatureMenuPosition: String
	var hideAllWindows: Boolean
	var mainmenuPosition: String
	var minimapScale: Int
	var slotMenuOrder: String
	var slotMenuPremiumOrder: String
	var slotMenuProActionOrder: String
	var slotmenuPosition: String
	var slotmenuPremiumPosition: String
	var slotmenuProActionPosition: String
	var stageSize: String
}
