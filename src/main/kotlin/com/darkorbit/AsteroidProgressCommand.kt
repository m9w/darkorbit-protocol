package com.darkorbit

interface AsteroidProgressCommand : ProtocolPacket {
	var battleStationId: Int
	var bestProgress: Float
	var bestProgressClanName: String
	var buildButtonActive: Boolean
	var ownClanName: String
	var ownProgress: Float
	var state: EquippedModulesModule
}
