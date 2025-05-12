package com.darkorbit

interface HitpointInfoCommand : ProtocolPacket {
	var hitpoints: Int
	var hitpointsMax: Int
	var nanoHull: Int
	var nanoHullMax: Int
}
