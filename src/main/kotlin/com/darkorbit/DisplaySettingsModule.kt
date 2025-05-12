package com.darkorbit

interface DisplaySettingsModule : ProtocolPacket {
	var alwaysDraggableWindows: Boolean
	var displayBoxes: Boolean
	var displayCargoboxes: Boolean
	var displayChat: Boolean
	var displayDrones: Boolean
	var displayHitpointBubbles: Boolean
	var displayMinimapBackground: Boolean
	var displayMyDrones: Boolean
	var displayNotifications: Boolean
	var displayPenaltyCargoboxes: Boolean
	var displayPlayerName: Boolean
	var displayResources: Boolean
	var displaySetting3DqualityAntialias: Int
	var displaySetting3DqualityBackground: Int
	var displaySetting3DqualityEffects: Int
	var displaySetting3DqualityLights: Int
	var displaySetting3DqualityTextures: Int
	var displaySetting3DqualityZones: Int
	var displaySetting3DsizeTextures: Int
	var displaySetting3DtextureFiltering: Int
	var displayUse2d: Boolean
	var displayWindowBackground: Boolean
	var notSet: Boolean
	var pixelatedRenderingEnabled: Boolean
	var preloadUserShips: Boolean
	var proActionBarAutohideEnabled: Boolean
	var proActionBarEnabled: Boolean
	var proActionBarKeyboardInputEnabled: Boolean
	var shipHovering: Boolean
	var showNotOwnedItems: Boolean
	var showSecondQuickslotBar: Boolean
	var useAutoQuality: Boolean
}
