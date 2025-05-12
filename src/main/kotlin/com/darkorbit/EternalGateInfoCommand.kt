package com.darkorbit

interface EternalGateInfoCommand : ProtocolPacket {
	var boosterInfoCommand: EternalGateBoosterInfoCommand
	var keyInfo: EternalGateKeyInfoCommand
	var playerRankRanges: MutableList<RankRewardRangeModule>
	var rankInfoCommand: EternalGateRankInfoCommand
	var waveInfo: EternalGateWaveInfoCommand
}
