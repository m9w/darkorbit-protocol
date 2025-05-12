package com.darkorbit

interface ClanReportAdminCommand : ProtocolPacket {
	var errorMsg: BaseStackCommand
	var success: Boolean
}
