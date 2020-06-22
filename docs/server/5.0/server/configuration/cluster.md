# Cluster settings

## ClusterSize

--cluster-size=VALUE<br/> | CLUSTER_SIZE | ClusterSize | The number of nodes in the cluster. (Default: 1)

## NodePriority

--node-priority=VALUE<br/> | NODE_PRIORITY | NodePriority | The node priority used during master election (Default: 0) |

## CommitCount

--commit-count=VALUE<br/> | COMMIT_COUNT | CommitCount | The number of nodes which must acknowledge commits before acknowledging to a client. (Default: -1) |

## PrepareCount

--prepare-count=VALUE<br/> | PREPARE_COUNT | PrepareCount | The number of nodes which must acknowledge prepares. (Default: -1) |

## DiscoverViaDns

--discover-via-dns=VALUE<br/> | DISCOVER_VIA_DNS | DiscoverViaDns | Whether to use DNS lookup to discover other cluster nodes. (Default: True) |

## ClusterDns

--cluster-dns=VALUE<br/> | CLUSTER_DNS | ClusterDns | DNS name from which other nodes can be discovered. (Default: fake.dns) |

## ClusterGossipPort

--cluster-gossip-port=VALUE<br/> | CLUSTER_GOSSIP_PORT | ClusterGossipPort | The port on which cluster nodes' managers are running. (Default: 30777) |

## GossipSeed

--gossip-seed=VALUE<br/> | GOSSIP_SEED | GossipSeed | Endpoints for other cluster nodes from which to seed gossip (Default: n/a) |

## GossipIntervalMs

--gossip-interval-ms=VALUE<br/> | GOSSIP_INTERVAL_MS | GossipIntervalMs | The interval in ms that nodes should try to gossip with each other (Default: 1000) |

## GossipAllowedDifferenceMs

--gossip-allowed-difference-ms=VALUE<br/> | GOSSIP_ALLOWED_DIFFERENCE_MS | GossipAllowedDifferenceMs | The amount of drift, in ms, between clocks on nodes allowed before gossip is rejected. (Default: 60000) |

## GossipTimeoutMs

--gossip-timeout-ms=VALUE<br/> | GOSSIP_TIMEOUT_MS | GossipTimeoutMs | The timeout in ms of gossip to another node. (Default: 500) |

## InitializationThreads

--initialization-threads=VALUE | INITIALIZATION_THREADS | InitializationThreads | Number of threads used to load chunk and index files. (Default: 1) |

## ReduceFileCachePressure

--reduce-file-cache-pressure=VALUE| REDUCE_FILE_CACHE_PRESSURE | reduceFileCachePressure   | Disables `FileOptions.RandomAccess` cache flag when opening chunk files. Useful if the Windows File Cache is consuming memory. (Default: False) |

## DisableFirstLevelHttpAuthorization

--disable-first-level-http-authorization=VALUE | DISABLE_FIRST_LEVEL_HTTP_AUTHORIZATION | DisableFirstLevelHttpAuthorization | Disables authorization layer on endpoints. (Default: True) |
