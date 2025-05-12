package com.darkorbit

interface GameplaySettingsModule : ProtocolPacket {
	var autoBoost: Boolean
	var autoBuyGreenBootyKeys: Boolean
	var autoChangeAmmo: Boolean
	var autoRefinement: Boolean
	var autoStart: Boolean
	var doubleclickAttack: Boolean
	var notSet: Boolean
	var quickslotStopAttack: Boolean
	var showBattlerayNotifications: Boolean
	var showLowHealthWarning: Boolean
}
