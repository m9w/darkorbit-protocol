package com.darkorbit

interface PlaySoundCommand : ProtocolPacket {
	var soundType: SoundType
}
