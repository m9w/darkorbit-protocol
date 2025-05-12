package com.darkorbit

interface DominationFactionInfluenceUpdateCommand : FactionInfluenceUpdateCommand {
	var eicDominationPoints: Int
	var mmoDominationPoints: Int
	var vruDominationPoints: Int
}
