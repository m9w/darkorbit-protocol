package com.darkorbit

interface SeasonPassRewardClaimRequest : ProtocolPacket {
	var extGoldPass: Boolean
	var goldPass: Boolean
	var level: Int
}
