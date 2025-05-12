package com.darkorbit

interface GroupMemberInitializationCommand : ProtocolPacket {
	var active: Boolean
	var blockingInvitations: Boolean
	var clan: ClanModule
	var cloaked: Boolean
	var faction: FactionModule
	var health: HealthModule
	var id: Int
	var inFight: Boolean
	var level: Int
	var location: LocationModule
	var loggedOut: Boolean
	var name: String
	var raidGateGameStage: RaidGateGameStageModule
	var shipIcon: ShipIconModule
	var target: TargetModule
}
