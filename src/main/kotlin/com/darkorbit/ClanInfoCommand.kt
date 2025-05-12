package com.darkorbit

interface ClanInfoCommand : ProtocolPacket {
	var clanCredits: Long
	var clanDesc: String
	var clanIcon: String
	var clanId: Int
	var clanLeaderId: Int
	var clanLeaderName: String
	var clanName: String
	var clanRank: Int
	var clanTag: String
	var company: Int
	var insertDate: String
	var memberCount: Int
	var ranking: Int
	var recruitionInfo: Int
	var recruitionStatus: Int
	var taxRate: Int
	var teamspeakAdd: String
}
