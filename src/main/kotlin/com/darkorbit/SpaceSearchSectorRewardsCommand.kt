package com.darkorbit

interface SpaceSearchSectorRewardsCommand : ProtocolPacket {
	var rewards: MutableList<SpaceSearchSectorRewards>
}
