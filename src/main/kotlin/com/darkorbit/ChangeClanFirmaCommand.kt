package com.darkorbit

interface ChangeClanFirmaCommand : ProtocolPacket {
	var companyDateInfoCommand: CompanyDateInfoCommand
	var errorMsg: BaseStackCommand
	var firm: Int
	var success: Boolean
}
