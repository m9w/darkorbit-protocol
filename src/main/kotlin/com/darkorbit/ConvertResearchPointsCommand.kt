package com.darkorbit

interface ConvertResearchPointsCommand : ProtocolPacket {
	var logfiles: Int
	var required: Int
	var researchPoints: Int
	var success: Boolean
}
