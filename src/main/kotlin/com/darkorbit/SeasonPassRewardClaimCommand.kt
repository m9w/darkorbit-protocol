package com.darkorbit

interface SeasonPassRewardClaimCommand : ProtocolPacket {
	var claimed: Boolean
	var extGoldPass: Boolean
	var goldPass: Boolean
	var level: Int
}
