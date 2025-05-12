package com.darkorbit

interface CompanyHierarchyInitializationCommand : ProtocolPacket {
	var eicRanking: MutableList<CompanyHierarchyRankingModule>
	var mmoRanking: MutableList<CompanyHierarchyRankingModule>
	var ownFaction: FactionModule
	var ownRanking: CompanyHierarchyRankingModule
	var vruRanking: MutableList<CompanyHierarchyRankingModule>
}
