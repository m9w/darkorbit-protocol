package com.darkorbit

interface SettingsOldFlashCommand : ProtocolPacket {
	var autoBoost: Boolean
	var autochangeAmmo: Boolean
	var displayAllLasers: Boolean
	var displayAlphaBG: Boolean
	var displayChat: Boolean
	var displayDamage: Boolean
	var displayDigits: Boolean
	var displayExplosions: Boolean
	var displayFractionIcon: Boolean
	var displayHitpointsBubbles: Boolean
	var displayMessages: Boolean
	var displayPlayerName: Boolean
	var dsplyDrones: Boolean
	var enableFastBuy: Boolean
	var ignoreCARGO: Boolean
	var ignoreCargoBoxes: Boolean
	var ignoreHostileCARGO: Boolean
	var ignoreResources: Boolean
	var music: Boolean
	var selectedLaser: AmmunitionTypeModule
	var selectedRocket: AmmunitionTypeModule
	var showStarsystem: Boolean
	var simpleGates: Boolean
	var simpleOpponents: Boolean
	var sound: Boolean
}
