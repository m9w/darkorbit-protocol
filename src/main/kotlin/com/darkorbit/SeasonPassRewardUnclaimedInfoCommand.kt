package com.darkorbit

interface SeasonPassRewardUnclaimedInfoCommand : ProtocolPacket {
	var captainLimit: Int
	var captainOwned: Long
	var captainPending: Int
	var captainWarning: Boolean
	var marketingImage: String
	var seasonName: String
	var spcId: Int
}
