package com.darkorbit

interface LoginInitMyApplyCommand : ProtocolPacket {
	var applyClanList: MutableList<ClanInfoCommand>
	var companyDateInfoCommand: CompanyDateInfoCommand
	var foundCost: Int
	var rejectApplyClanList: MutableList<Int>
}
