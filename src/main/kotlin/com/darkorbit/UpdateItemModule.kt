package com.darkorbit

interface UpdateItemModule : ProtocolPacket {
	var itemToUpdate: LabItemModule
	var oreCountToUpdateWith: OreCountModule
}
