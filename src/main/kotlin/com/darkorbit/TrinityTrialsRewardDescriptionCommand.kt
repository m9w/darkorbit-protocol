package com.darkorbit

interface TrinityTrialsRewardDescriptionCommand : ProtocolPacket {
	var rewardDescriptionList: MutableList<TupleThreeModule>
}
