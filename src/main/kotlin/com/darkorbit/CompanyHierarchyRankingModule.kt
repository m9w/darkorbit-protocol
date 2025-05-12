package com.darkorbit

interface CompanyHierarchyRankingModule : ProtocolPacket {
	var cbsNamesAndLocations: String
	var clanId: Int
	var clanName: String
	var leaderName: String
	var rank: Int
	var rankingPoints: Int
}
