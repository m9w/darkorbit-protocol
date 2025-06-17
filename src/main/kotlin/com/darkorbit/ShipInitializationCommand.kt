package com.darkorbit

interface ShipInitializationCommand : ProtocolPacket {
	var captainEnergy: Int
	var cargoSpace: Int
	var cargoSpaceMax: Int
	var clanId: Int
	var clanTag: String
	var cloaked: Boolean
	var credits: Long
	var dailyRank: Int
	var ep: Long
	var expansionStage: Int
	var factionId: Int
	var galaxyGatesDone: Int
	var hitMax: Long
	var hitPoints: Long
	var honourPoints: Long
	var jackpot: Float
	var level: Int
	var mapId: Int
	var maxCaptainEnergy: Int
	var maxNanoHull: Int
	var modifier: MutableList<VisualModifierCommand>
	var nanoHull: Int
	var premium: Boolean
	var refreshMap: Boolean
	var shield: Int
	var shieldMax: Int
	var speed: Int
	var typeId: String
	var uridium: Long
	var useSystemFont: Boolean
	var userId: Int
	var userName: String
	var x: Int
	var y: Int
}
