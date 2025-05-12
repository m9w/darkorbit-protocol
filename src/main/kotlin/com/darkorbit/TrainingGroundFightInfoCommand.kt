package com.darkorbit

interface TrainingGroundFightInfoCommand : ProtocolPacket {
	var opponentHitpoints: Int
	var opponentHitpointsMax: Int
	var opponentShield: Int
	var opponentShieldMax: Int
	var opponentVictoryPoint: Int
	var playerHitpoints: Int
	var playerHitpointsMax: Int
	var playerShield: Int
	var playerShieldMax: Int
	var playerVictoryPoint: Int
}
