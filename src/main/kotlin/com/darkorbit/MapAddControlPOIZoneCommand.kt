package com.darkorbit

interface MapAddControlPOIZoneCommand : MapAddPOICommand {
	var captureProgress: Int
	var captureThreshold: Int
	var captured: Boolean
	var progressOwner: FactionModule
	var timeTillUnlock: Long
}
