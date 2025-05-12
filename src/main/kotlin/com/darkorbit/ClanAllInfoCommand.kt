package com.darkorbit

interface ClanAllInfoCommand : ProtocolPacket {
	var clanApplyInfoListCommand: ClanApplyInfoListCommand
	var clanDiploInfoCommands: MutableList<ClanDiploInfoCommand>
	var clanDiploReqInfoCommands: MutableList<ClanDiploReqInfoCommand>
	var clanInfoCommand: ClanInfoCommand
	var clanMemberInfoCommandList: MutableList<ClanMemberInfoCommand>
	var clanMessageInfoCommands: MutableList<ClanMessageInfoCommand>
	var clanNewsInfoCommands: MutableList<ClanNewsInfoCommand>
	var clanRankInfoCommands: MutableList<ClanRankInfoCommand>
	var clanTaxInfoCommand: ClanTaxInfoCommand
	var companyDateInfoCommand: CompanyDateInfoCommand
	var myClanDiploReqInfoCommands: MutableList<ClanDiploReqInfoCommand>
}
